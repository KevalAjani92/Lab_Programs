const demo = document.getElementById('demo');
demo.addEventListener('mousedown', (event) => {
    if (event.button === 0) {
        Toastify({
            text: "Left Click Detected",
            duration: 2000,
        }).showToast();
    }
    else if (event.button === 2) {
        Toastify({
            text: "Right Click Detected",
            duration: 2000,
        }).showToast();
    }
    
});
