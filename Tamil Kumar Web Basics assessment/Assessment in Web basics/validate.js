document.getElementById("regform").addEventListener("submit", function(e) {
    let isValid =true;
    let name=document.getElementById("name").value.trim();
    let email=document.getElementById("email").value.trim();
    let dob=document.getElementById("dob").value;
    let course=document.getElementById("course").value;
    document.getElementById("nameError").textContent="";
    document.getElementById("emailError").textContent="";
    document.getElementById("dobError").textContent="";
    document.getElementById("courseError").textContent="";
    if(name===""){
        document.getElementById("nameError").textContent ="Name required";
        isValid=false;
    }
    if(!email.includes("@")||!email.endsWith(".com")){
        document.getElementById("emailError").textContent="Invalid email";
        isValid=false;
    }
    let today=new Date();
    let birthDate=new Date(dob);
    let age=today.getFullYear()-birthDate.getFullYear();

    if(age<17){
        document.getElementById("dobError").textContent="Must be at least 17 years old";
        isValid = false;
    }
    if(course===""){
        document.getElementById("courseError").textContent="Select a course";
        isValid=false;
    }
    if(!isValid){
        e.preventDefault();
    }
});
