package oop_calesa;

public class object<Name, Age> {

    private Name key;
    private Age value;

    public object(Name key, Age value) {
        this.key = key;
        this.value = value;
    }

    public Name getKey()    { 
        return key; 
    }
    
    public Age getValue() { 
        return value; 
    }
}
