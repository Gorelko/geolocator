function copyFunction() {
    var copyText = document.getElementById("notice");
    copyText.select();
    document.execCommand("copy");
}