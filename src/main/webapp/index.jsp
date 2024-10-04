<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tela de Login</title>
    <!-- Link do CSS do Bootstrap 5.3.3 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Estilo para centralizar o card verticalmente */
        html, body {
            height: 100%;
        }
        .container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100%;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="col-md-4">
        <div class="card ">
            <div class="card-body">
                <h2 class="text-center mb-4">PiDelivery</h2>
                <form>
                    <div class="mb-3">
                        <label for="username" class="form-label"></label>
                        <input type="text" class="form-control" id="username" placeholder="CPF">
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label"></label>
                        <input type="password" class="form-control" id="password" placeholder="Senha">
                    </div>
                    <button type="submit" class="btn btn-primary w-100 mb-5 mt-5">Entrar</button>
                </form>
            </div>
        </div>
    </div>
</div>

<!-- Link do JavaScript do Bootstrap 5.3.3 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>