<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authentification</title>
</head>
<body>
	<h1>
		Bienvenue<br> <small>sur Assist'RH</small>
	</h1>
	<form action="redirect" method="post" accept-charset="UTF-8"
		autocomplete="on">
		<fieldset class="fieldset">
			<legend>Connexion</legend>
			Login<br>
			<p>
				<input type="text" class="form-control" name="id"
					placeholder="Login">
			</p>
			<br> Mot de passe<br>
			<p>
				<input type="password" class="form-control" name="password"
					placeholder="Mot de passe">
			</p>
			<br> <br> <input type="submit" value="Submit"
				class="btn btn-primary">
		</fieldset>
	</form>
</body>
</html>