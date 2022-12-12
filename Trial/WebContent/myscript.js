var createLeadBtn = document.getElementById('createLeadBtn');
var createFormModal = document.getElementById('createFormModal');
var updateBtn = document.getElementById("updateBtn");
var updateFormModal = document.getElementById('updateFormModal');
var closeModalBtn = document.getElementById('closeModalBtn');
var closeUpdateFormBtn = document.getElementById('closeUpdateFormBtn');

createLeadBtn.addEventListener('click', function() {
	createFormModal.style.display = 'block';
});
	  
updateBtn.addEventListener('click',function(){
	updateFormModal.style.display = 'block';
});
	
closeModalBtn.addEventListener('click',function(){
	createFormModal.style.display = 'none';	
});
		
closeUpdateFormBtn.addEventListener('click',function(){
	updateFormModal.style.display = 'none';	
});
		