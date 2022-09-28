// Add Bootstrap classes to content elements.
window.addEventListener("DOMContentLoaded", () => {
    console.log("adding bootstrap styles...")
    for (const table of document.querySelectorAll("table")) {
        table.classList.add("table")
        table.classList.add("table-striped")
    }
    for (const heading of document.querySelectorAll("h1, h2, h3, h4, h5, h6")) {
        heading.classList.add("my-3")
    }
})