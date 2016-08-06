$(document).ready(function() {
	$(".button-collapse").sideNav();

	$("#login-form").validate({
        rules: {
            ulogin: {
                required: true,
                minlength: 5,
                maxlength: 50
            },
            upassword: {
				required: true,
				minlength: 6,
				maxlength: 50
			}
        },
        messages: {
            ulogin:{
                required: "Enter a username",
                minlength: "Enter at least 5 characters",
                maxlength: "Enter no more than 50 characters"
            },
            upassword:{
                required: "Enter password",
                minlength: "Enter at least 6 characters",
                maxlength: "Enter no more than 50 characters"
            }
        },
        errorElement : 'div',
        errorPlacement: function(error, element) {
          var placement = $(element).data('error');
          if (placement) {
            $(placement).append(error)
          } else {
            error.insertAfter(element);
          }
        }
     });
	
	$("#reg-form").validate({
        rules: {
            rlogin: {
                required: true,
                minlength: 5,
                maxlength: 50
            },
            rpassword: {
				required: true,
				minlength: 6,
				maxlength: 50
			},
			cpassword: {
				required: true,
				equalTo: "#rpassword"
			}
        },
        messages: {
            rlogin:{
                required: "Enter a username",
                minlength: "Enter at least 5 characters",
                maxlength: "Enter no more than 50 characters"
            },
            rpassword:{
                required: "Enter password",
                minlength: "Enter at least 6 characters",
                maxlength: "Enter no more than 50 characters"
            },
            cpassword:{
                required: "Repeat password",
                equalTo: "Password does not match"
            }
        },
        errorElement : 'div',
        errorPlacement: function(error, element) {
          var placement = $(element).data('error');
          if (placement) {
            $(placement).append(error)
          } else {
            error.insertAfter(element);
          }
        }
     });
});