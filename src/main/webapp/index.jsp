<html>
<head>
<meta charset="ISO-8859-1">
<title>LOG-IN PAGE</title>

<style>

body {
  background-image: url('https://www.google.com/search?q=Global+logic&rlz=1C1FHFK_enIN1014IN1014&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjq67yIkr35AhV-1zgGHVAGBcEQ_AUoAnoECAIQBA&biw=1280&bih=577&dpr=1.5#imgrc=eBa-P9Ay4C73NM');
  background-repeat: no-repeat;
}
/* Bordered form */
form {
  border: 3px solid #f1f1f1;
}

/* Full-width inputs */
input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

/* Set a style for all buttons */
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

/* Add a hover effect for buttons */
button:hover {
  opacity: 0.8;
}

/* Extra style for the cancel button (red) */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the avatar image inside this container */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

/* Avatar image */
img.avatar {
  width: 40%;
  border-radius: 50%;
}

/* Add padding to containers */
.container {
  padding: 16px;
}

/* The "Forgot password" text */
span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
    display: block;
    float: none;
  }
  .cancelbtn {
    width: 100%;
  }
}



</style>
</head>
<body>
<h1><center>LOG-IN</center></h1>
<!--  
<form method="GET" action="HomePageController">
<label>UserName : </label><input type="text" name="username">
<label>Password : </label><input type="text" name="password">
<input type="submit" value="submit">
</form>
-->

<form action="HomePageController" method="get">
  <div class="imgcontainer">
    <img src="https://www.globallogic.com/wp-content/uploads/2021/07/GlobalLogic-Social-1.jpg" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>


</body>
</html>


