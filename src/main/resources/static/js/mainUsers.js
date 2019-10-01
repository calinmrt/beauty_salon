$(document).ready(function () {
    $('.nBtn, .table .eBtn').on('click', function (event) {
        event.preventDefault();
        var href=$(this).attr('href');
        var text=$(this).text();
        if(text=='Edit') {
            $.get(href, function (user, status) {
                $('.myForm #idUser').val(user.idUser);
                $('.myForm #email').val(user.email);
                // $('.myForm #password').val(user.password);
                $('.myForm #phone').val(user.phone);
                $('.myForm #userName').val(user.userName);
                // $('.myForm #role').val(user.role);

            });
            $('.myForm #exampleModal').modal();
        }else{
            $('.myForm #idUser').val('');
            $('.myForm #email').val('');
            // $('.myForm #password').val('');
            $('.myForm #phone').val('');
            $('.myForm #userName').val('');
            // $('.myForm #role').val('');


            $('.myForm #exampleModal').modal();
        }
    });

});