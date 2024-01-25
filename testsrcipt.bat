@echo off
FOR /L %%i IN (1,1,100) DO (
    curl -s http://localhost:8080/hotels
    timeout /nobreak /n 1 > nul
)
