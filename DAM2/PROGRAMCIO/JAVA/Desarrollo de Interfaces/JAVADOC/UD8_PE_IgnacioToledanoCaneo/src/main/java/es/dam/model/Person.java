package es.dam.model;

/**
 * Modelo Persona
 * 
 * @author nacho
 */
public class Person {
   private int addressID;
   private String firstName;
   private String lastName;
   private String email;
   private String phoneNumber;

   /**
    * Constructor Vacio
    */
   public Person() {}

   /**
    * Constructor completo de persona
    * 
    * @param addressID Int id del address
    * @param firstName String primer nombre
    * @param lastName String apellidos
    * @param email String Correo electronico
    * @param phoneNumber String numero de telefono
    */
   public Person(int addressID, String firstName, String lastName, 
      String email, String phoneNumber) {
      this.addressID = addressID;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.phoneNumber = phoneNumber;
   }

   /**
    * Setter del addressID de la persona
    * 
    * @param addressID Int con el nuevo ID de la persona
    */
   public void setAddressID(int addressID) {this.addressID = addressID;}

   /**
    * Getter de el addresID de la persona
    * 
    * @return Int addresID 
    */
   public int getAddressID() {return addressID;}
   
   /**
    * Setter del del primer nombre
    * 
    * @param firstName String nuevo nombre de la persona
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   /**
    * Getter del nombre de la persona
    * 
    * @return String nombre de la persona 
    */
   public String getFirstName() {return firstName;}
   
   /**
    * Setter del apellido de la persona
    * 
    * @param lastName String nuevo apellido de la persona
    */
   public void setLastName(String lastName) {this.lastName = lastName;}

   /**
    * Getter del apellido de la persona
    * 
    * @return String apellido de la persona 
    */
   public String getLastName() {return lastName;}
   
   /**
    * Setter del nombre de la persona
    * 
    * @param email String nuevo email de la persona 
    */
   public void setEmail(String email) {this.email = email;}

   /**
    * Getter del email de la persona
    * 
    * @return String del email de la persona
    */
   public String getEmail() {return email;}
   
   /**
    * Setter del numero de telefono de la persona
    * 
    * @param phoneNumber String nuevo numero de telefono de la persona
    */
   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   } 

   /**
    * Getter del numero de telefono de la persona
    * 
    * @return String el numero de telefono de la persona
    */
   public String getPhoneNumber() {return phoneNumber;}

   /**
    * ToString de la persona
    * 
    * @return String con apellidos y nombre en ese orden
    */
   @Override
   public String toString() 
      {return getLastName() + ", " + getFirstName();}
}

