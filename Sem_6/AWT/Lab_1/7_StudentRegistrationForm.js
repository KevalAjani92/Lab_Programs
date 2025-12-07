function registerStudent(event) {
  event.preventDefault();
  const username = document.getElementById("username").value;
  const fullname = document.getElementById("fullName").value;
  const email = document.getElementById("userEmail").value;
  const userContact = document.getElementById("userContact").value;
  const password = document.getElementById("password").value;
  const confirmPassword = document.getElementById("confirmPassword").value;
    console.log(username);
    console.log(fullname);
    console.log(email);
    console.log(userContact);
    console.log(password);

    if (!username || !fullname || !email || !userContact || !password || !confirmPassword) {
        Swal.fire({
            icon: "error",
            title: "Registration Failed",
            text: "All fields are required.",
        });
        return;
    }

    //username validation only alphanumeric and between 3-20 characters
    const usernamePattern = /^[a-zA-Z0-9]{3,20}$/;
    if (username.length < 3 || username.length > 20 || !usernamePattern.test(username)) {
        Swal.fire({
            icon: "error",
            title: "Registration Failed",
            text: "Username must be between 3 and 20 characters and alphabet and numbers.",
        });
        return;
    }

    //email validation
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        Swal.fire({
            icon: "error",
            title: "Registration Failed",
            text: "Please enter a valid email address.",
        });
        return;
    }

    //phone number validation
    const phonePattern = /^\d{10}$/;
    if (!phonePattern.test(userContact)) {
        Swal.fire({
            icon: "error",
            title: "Registration Failed",
            text: "Please enter a valid 10-digit phone number.",
        });
        return;
    }
    
    if (password !== confirmPassword) {
        Swal.fire({
            icon: "error",
            title: "Registration Failed",
            text: "Passwords do not match to confirm password.",
        }
        );
        return;
    }
    Swal.fire({
        icon: "success",
        title: "Registration Successful",
        text: `Welcome, ${username}!`,
    });
}
document.getElementById("registrationForm").addEventListener("submit", registerStudent);