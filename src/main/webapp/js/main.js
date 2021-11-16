function confirmToDelete() {

    var res =  confirm("Are you sure to delete?");
    if(res == true){
        return true;
    }else {
        return false;
    }
}

function confirmOnEdit(){

    var res =  confirm("Do you like to edit?");
    if(res == true){
        return true;
    }else {
        return false;
    }
}