$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/api/places/list"
    }).then(function(data) {
        $("#lat").val(data[0].latitude);
        $("#long").val(data[0].longitude);
    });
});

