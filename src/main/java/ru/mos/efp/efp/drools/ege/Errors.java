package ru.mos.efp.efp.drools.ege;


/**
 * This class was automatically generated by the data modeler tool.
 */

public class Errors implements java.io.Serializable
{

   static final long serialVersionUID = 1L;
   
   
   private java.util.Map<String, java.util.List<ru.mos.efp.efp.drools.ege.Error>> errors;

   public Errors()
   {
       this.errors = new java.util.HashMap<String, java.util.List<ru.mos.efp.efp.drools.ege.Error>>();
   }

   public java.util.Map<String, java.util.List<ru.mos.efp.efp.drools.ege.Error>> getErrors()
   {
      return this.errors;
   }

   public void setErrors(java.util.Map<String, java.util.List<ru.mos.efp.efp.drools.ege.Error>> errors)
   {
      this.errors = errors;
   }

   public Errors(java.util.Map<String, java.util.List<ru.mos.efp.efp.drools.ege.Error>> errors)
   {
      this.errors = errors;
   }
   
   public void addError(String key, ru.mos.efp.efp.drools.ege.Error error) {
       if (!this.errors.containsKey(key)) {
           this.errors.put(key, new java.util.LinkedList());
       } 
       this.errors.get(key).add(error);
   }

}