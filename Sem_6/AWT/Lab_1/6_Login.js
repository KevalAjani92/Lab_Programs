function formSubmit(event) {
  event.preventDefault();
  const username = document.getElementById("username").value;
  const password = document.getElementById("password").value;
  console.log(username);
  console.log(password);
  
  if (username === "admin" && password === "admin@123") {
    Swal.fire({
      icon: "success",
      title: "Login Successful",
      text: "Welcome, admin!",
    });
  } else {
    Swal.fire({
      icon: "error",
      title: "Login Failed",
      text: "Invalid username or password.",
    });
  }
}

document.getElementById("loginForm").addEventListener("submit", formSubmit);

