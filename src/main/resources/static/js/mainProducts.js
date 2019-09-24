$(document).ready(function () {
    $('.nBtn, .table .eBtn').on('click', function (event) {
        event.preventDefault();
        var href=$(this).attr('href');
        var text=$(this).text();
        if(text=='Edit') {
            $.get(href, function (product, status) {
                $('.myForm #idProduct').val(product.idProduct);
                $('.myForm #productName').val(product.productName);
                $('.myForm #productCode').val(product.productCode);
                $('.myForm #quantity').val(product.quantity);
                $('.myForm #measureUnit').val(product.measureUnit);
                $('.myForm #unitPrice').val(product.unitPrice);
            });
            $('.myForm #exampleModal').modal();
        }else{
            $('.myForm #idProduct').val('');
            $('.myForm #productName').val('');
            $('.myForm #productCode').val('');
            $('.myForm #quantity').val('');
            $('.myForm #measureUnit').val('');
            $('.myForm #unitPrice').val('');
            $('.myForm #exampleModal').modal();
        }
    });

    $('.table .dBtn').on('click',function (event) {
        event.preventDefault();
        var href=$(this).attr('href');
        $('#delModal #deleteProduct').attr('href',href);
        $('#delModal').modal();
    });
});