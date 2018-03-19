$(function(){

  function filter() {
    var selected = $('.filter-list input:checkbox:checked').map(function(){
      return $(this).val();
    }).get();
    if(selected.length == 0) {
      clearFilter();
    }
    else {
      // var selected = $('input[name="project"]:checked').val();

      $('table.aui tbody tr').addClass('hidden');

      $('table.aui tbody tr td:first-child').each(function( index ) {
        var elem = $(this);
        var text = elem.text();
        $.each(selected, function(index, value) {
          if(text.includes(value)){
            elem.parent().removeClass('hidden');
          }
        });
      });

      $("tr:not(.hidden)").each(function (index) {
        $(this).removeClass('odd');
        $(this).removeClass('even');

        if ( index % 2 == 0) {
          $(this).toggleClass("even");
        }
        else {
          $(this).toggleClass("odd");
        }
      });
    }
  }

  function clearFilter() {
    $('table.aui tbody tr').removeClass('hidden');

    $("tr").each(function (index) {
      $(this).removeClass('odd');
      $(this).removeClass('even');

      if ( index % 2 == 0) {
        $(this).toggleClass("even");
      }
      else {
        $(this).toggleClass("odd");
      }
    });
  }

  $('input[name="project"]').on('click', function(){
    filter();
  });

  $('.clear-filter-btn').on('click', function() {
    $('.filter-list input:checkbox:checked').prop('checked', false);
    clearFilter();
  });
});
