let current_op = null;

let current_input = "";

let previous_input = "";

function clear_Input_Field() {

    const result_field = document.getElementById('result');
    
    result_field.value = '';
    
    current_input = "";
    
    previous_input = "";

    current_op = null;

}

function add_Number(number) {

    const result_field = document.getElementById('result');
    
    if (result_field.value === "" && number === ".") 
        {
            result_field.value = "0.";
        } 

    else 
    {
        result_field.value += number;
    }
    
    current_input = result_field.value;
    
}

function Operations(operator) {

    const result_field = document.getElementById('result');
    
    if (current_op !== null) 
        calculate();
    
    previous_input = current_input;
    
    current_op = operator;
    
    current_input = "";
    
    result_field.value = "";

}

function calculate() {

    const result_field = document.getElementById('result');
    
    if (current_op && previous_input !== "") {

        let result = 0;

        let previous = parseFloat(previous_input);
        
        let current = parseFloat(current_input);
        
        switch (current_op) {

            case '+': 

                result = previous + current; 
                break;

            case '-': 

                result = previous - current; 
                break;

            case '*': 

            
                result = previous * current; 
                break;

            case '/': 

                result = previous / current; 
                break;

            default: 
                return;
        }

        result_field.value = result.toString();
        
        current_input = result.toString();
        
        current_op = null;
    
    }
}
