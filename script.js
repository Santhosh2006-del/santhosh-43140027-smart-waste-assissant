function addItem() {
  const type = document.getElementById("newName").value.trim();
  const weight = document.getElementById("newWeight").value.trim();
  const category = document.getElementById("newCategory").value.trim();
  const method = document.getElementById("newMethod").value.trim();

  if (!type || !weight || !category || !method) {
    alert("Please fill all fields!");
    return;
  }

  fetch("http://localhost:8080/api/waste", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ type, weight, category, method })
  })
    .then(res => res.json())
    .then(data => {
      console.log("✅ Added:", data);
      alert("Waste item added successfully!");
      showData();
    })
    .catch(err => console.error("❌ Error:", err));
}

function showData() {
  fetch("http://localhost:8080/api/waste")
    .then(res => res.json())
    .then(data => {
      let table = `<table border='1' style='width:100%;text-align:center;'>
        <tr><th>ID</th><th>Type</th><th>Weight</th><th>Category</th><th>Method</th></tr>`;
      data.forEach(item => {
        table += `<tr>
          <td>${item.id}</td>
          <td>${item.type}</td>
          <td>${item.weight}</td>
          <td>${item.category}</td>
          <td>${item.method}</td>
        </tr>`;
      });
      table += "</table>";
      document.getElementById("output").innerHTML = table;
    })
    .catch(err => console.error("❌ Error fetching data:", err));
}

