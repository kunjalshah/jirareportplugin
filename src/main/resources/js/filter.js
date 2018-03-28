$(function() {

	if (!String.prototype.includes) {
		String.prototype.includes = function(search, start) {
			if (typeof start !== 'number') {
				start = 0;
			}

			if (start + search.length > this.length) {
				return false;
			} else {
				return this.indexOf(search, start) !== -1;
			}
		};
	}

	function filter() {
		var selectedProjects = $('.filter-list input:checkbox:checked').map(function() {
			return $(this).val();
		}).get();

		var selectedTiers = $('.filter-list-tiers input:checkbox:checked').map(function() {
			return $(this).val();
		}).get();

		console.log('selected tiers,  ' + selectedTiers.length + " projects size " + selectedProjects.length);
		
		$('table.aui tbody tr').addClass('hidden');

		if (selectedTiers.length == 0 && selectedProjects.length == 0) {
			clearFilter();
			
		} else if (selectedTiers.length == 0 || selectedProjects.length == 0) {

			$('table.aui tbody tr td:first-child').each(function(index) {
				var elem = $(this);
				var text = elem.text();
				$.each(selectedProjects, function(index, value) {
					if (text.includes(value)) {
						elem.parent().removeClass('hidden');
					}
				});
			});

			$('table.aui tbody tr td:nth-child(2)').each(function(index) {
				var elem = $(this);
				var text = elem.text();
				$.each(selectedTiers, function(index, value) {
					if (text.includes(value)) {
						elem.parent().removeClass('hidden');
					}
				});
			});

		} else {

			$('table.aui tbody tr').each(function(index) {
				var parent = $(this);
				var elem = parent.children(":first-child");
				var text = elem.text();
				$.each(selectedProjects, function(index, value) {
					if (text.includes(value)) {
						var elem1 = parent.children(':nth-child(2)');
						var text1 = elem1.text();
						$.each(selectedTiers, function(index, value1) {
							if (text1.includes(value1)) {
								elem1.parent().removeClass('hidden');
							}
						});
					}
				});
			});
		}

		$("tr:not(.hidden)").each(function(index) {
			$(this).removeClass('odd');
			$(this).removeClass('even');

			if (index % 2 == 0) {
				$(this).toggleClass("even");
			} else {
				$(this).toggleClass("odd");
			}
		});
	}

	function clearFilter() {
		$('table.aui tbody tr').removeClass('hidden');

		$("tr").each(function(index) {
			$(this).removeClass('odd');
			$(this).removeClass('even');

			if (index % 2 == 0) {
				$(this).toggleClass("even");
			} else {
				$(this).toggleClass("odd");
			}
		});
	}

	$('input[name="project"]').on('click', function() {
		filter();
	});

	$('input[name="tier"]').on('click', function() {
		filter();
	});

	$('.clear-filter-btn').on('click', function() {
		$('.filter-list input:checkbox:checked').prop('checked', false);
		$('.filter-list-tiers input:checkbox:checked').prop('checked', false);
		clearFilter();
	});
});