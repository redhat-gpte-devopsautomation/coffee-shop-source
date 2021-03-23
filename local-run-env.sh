#!/bin/bash
set -euo pipefail
cd ${0%/*}/coffee-shop

podman stop coffee-shop coffee-shop-db barista &> /dev/null || true

podman run -d --rm \
  --name coffee-shop-db \
  -p 5432:5432 \
  -e POSTGRES_USER=postgres \
  -e POSTGRES_PASSWORD=postgres \
  docker.io/postgres:9.5

podman run -d --rm \
  --name barista \
  -p 8002:8080 \
  docker.io/sdaschner/barista:quarkus-testing-1

sleep 3
podman run -d --rm \
  --name coffee-shop \
  -p 8001:8080 \
  coffee-shop:latest
