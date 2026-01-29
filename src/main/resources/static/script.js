function encode() {
    const text = document.getElementById("inputText").value;

    fetch("/api/morse/encode", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ text: text })
    })
        .then(response => response.json())
        .then(data => {
            document.getElementById("result").textContent = data.encoded;
        })
        .catch(err => {
            document.getElementById("result").textContent = "Error";
            console.error(err);
        });
}

function decode() {
    const text = document.getElementById("inputText").value;

    fetch("/api/morse/decode", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ text: text })
    })
        .then(res => res.json())
        .then(data => {
            document.getElementById("result").textContent = data.encoded;
        });
}

