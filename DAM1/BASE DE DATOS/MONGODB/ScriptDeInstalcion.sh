#!/bin/bash

# Guía de instalación y gestión de MongoDB en Ubuntu 24.04

echo "🔐 1. Añadiendo la clave GPG de MongoDB..."
curl -fsSL https://www.mongodb.org/static/pgp/server-4.4.asc | sudo apt-key add -

echo "🔍 2. Verificando que la clave se ha añadido..."
sudo apt-key list | grep -A 1 "MongoDB"

echo "📦 3. Añadiendo el repositorio oficial de MongoDB..."
echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu focal/mongodb-org/4.4 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-4.4.list

echo "🔄 4. Actualizando la lista de paquetes..."
sudo apt update

echo "⬇️ 5. Instalando MongoDB..."
sudo apt install -y mongodb-org

echo "🚀 6. Iniciando el servicio de MongoDB..."
sudo systemctl start mongod.service

echo "⚙️ 7. Habilitando MongoDB al arranque..."
sudo systemctl enable mongod

echo "✅ 8. Comprobando que MongoDB está funcionando correctamente..."
mongo --eval 'db.runCommand({ connectionStatus: 1 })'

echo "📊 9. Estado del servicio MongoDB:"
sudo systemctl status mongod --no-pager

echo "🔁 10. Comandos de gestión del servicio MongoDB:"
echo "   👉 Detener:   sudo systemctl stop mongod"
echo "   👉 Iniciar:   sudo systemctl start mongod"
echo "   👉 Reiniciar: sudo systemctl restart mongod"

echo "🔧 11. Activar/Desactivar inicio automático:"
echo "   👉 Desactivar: sudo systemctl disable mongod"
echo "   👉 Activar:    sudo systemctl enable mongod"

echo "🎉 Instalación y configuración completa."
