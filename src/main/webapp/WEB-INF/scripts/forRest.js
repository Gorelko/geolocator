function myFunction() {

    var enterInfor = document.getElementById("suggest").value;
    document.getElementById("suggest").value = "";
    var url = "http://localhost:8181/rest/" + enterInfor;
    var ajax = new XMLHttpRequest();
    ajax.open("GET", url, true);
    ajax.send(null);
    ajax.onreadystatechange = function () {

        if (ajax.readyState == 4 && (ajax.status == 200)) {
            console.log("ready")
            if (enterInfor.replaceAll(" ","")==""){
                $('#notice').val("Null")
            }else{
                var Data = JSON.parse(ajax.responseText);
                console.log(Data);
                /*document.getElementById("personinfo").innerHTML = Data.adress;*/
                $('#notice').val(Data.adress)
            }
        } else {
            console.log("not ready yet")
        }
    }
};

function copyFunction() {
    var copyText = document.getElementById("notice");
    copyText.select();
    document.execCommand("copy");
}