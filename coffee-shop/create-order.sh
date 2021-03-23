#!/bin/bash
set -eu

curl http://$(oc get route coffee-shop --template='{{ .spec.host }}'/orders -XPOST -i -H 'Content-Type: application/json' -d '{"origin":"Colombia","type":"Espresso"}'
