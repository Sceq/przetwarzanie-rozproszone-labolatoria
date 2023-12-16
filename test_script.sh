#!/bin/bash

curl -X POST http://localhost:8080/api/users \
                              -H 'Content-Type: application/json' \
                                 -d '{"name": "imie", "email": "email@example.com", "favoriteBook": "Autostopem Przez Galaktyke", "country": "Poland"}'
curl -X GET http://localhost:8080/api/users/1
read -p "Press any key to continue..."