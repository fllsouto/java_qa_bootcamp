#!/bin/bash

echo "Starting Deploy Script"
echo "Version : `firefox -v`"
echo "Display: $DISPLAY"
echo "Process Xvfb: \n`ps aux | grep Xvfb`"
mvn install

# talvez a build nao esteja sendo executada por causa que xvfb nao está sendo chamado, talvez se eu listar antes de chamar ele
# e um mvn clean e test, sei la
