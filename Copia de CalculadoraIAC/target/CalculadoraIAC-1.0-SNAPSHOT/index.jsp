<%-- 
    Document   : index
    Created on : 23 sep. 2024, 20:45:40
    Author     : kathymhtps
--%>

<html>
<head>
    <title>Cálculo del IAC</title>
</head>
<body>
    <h1>Calculadora del Índice de Adiposidad Corporal (IAC)</h1>
    <form action="calcularIAC" method="POST">
        <label for="altura">Altura (m):</label>
        <input type="text" id="altura" name="altura" required><br>
        <label for="cadera">Circunferencia de Cadera (cm):</label>
        <input type="text" id="cadera" name="cadera" required><br><br>
        <input type="submit" value="Calcular IAC">
    </form>
</body>
</html>

