package elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;

public class Elementos {

	
	 private By Make = By.id("make");
	 private By Model = By.id("model");
	 private By Cylinder = By.id("cylindercapacity");
	 private By Engine = By.id("engineperformance");
	 private By Date = By.id("dateofmanufacture");
	 private By Number = By.id("numberofseats");
	 private By Right  = By.xpath("//*[@class=\"ideal-radiocheck-label\"]");
	 private By NumberOf = By.id("numberofseatsmotorcycle");
	 private By FuelType = By.id("fuel");
	 private By Payload  = By.id("payload");
	 private By TotalWeight = By.id("totalweight");
	 private By ListPrice = By.id("listprice"); 	
	 private By LicensePlate = By.id("licenseplatenumber");
	 private By AnnualMileage = By.id("annualmileage");
	 private By Next1 = By.id("nextenterinsurantdata");
	 private By FirstName = By.id("firstname");
	 private By LastName = By.id("lastname");
	 private By DateBirth = By.id("birthdate");
	 private By Gender = By.xpath("//*[@class=\"ideal-radiocheck-label\"]");
	 private By StreetAddress = By.id("streetaddress");
	 private By Country = By.id("country");
	 private By ZipCode = By.id("zipcode");
	 private By City = By.id("city");
	 private By Occupation = By.id("occupation");
	 private By Hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span");
	 private By Next2 = By.name("Next (Enter Product Data)");
	 private By StartDate = By.id("startdate");
	 private By InsuranceSum = By.id("insurancesum");
	 private By MeritRating = By.id("meritrating");
	 private By DamageInsurance = By.id("damageinsurance");
	 private By OptionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	 private By CourtesyCar = By.id("courtesycar");
	 private By Next3 = By.id("nextselectpriceoption");
	 private By SelectOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	 private By Next4 = By.id("nextsendquote");
	 private By Email = By.id("email");
	 private By Phone = By.id("phone");
	 private By Username = By.id("username");
	 private By Password = By.id("password");
	 private By ConfirmPassword = By.id("confirmpassword");
	 private By Comments = By.id("Comments");
	 private By Send = By.id("sendemail");
	 private By sucess = By.xpath("//*[@class=\"confirm\"]");
	public By getMake() {
		return Make;
	}
	public By getModel() {
		return Model;
	}
	public By getCylinder() {
		return Cylinder;
	}
	public By getEngine() {
		return Engine;
	}
	public By getDate() {
		return Date;
	}
	public By getNumber() {
		return Number;
	}
	public By getRight() {
		return Right;
	}
	public By getNumberOf() {
		return NumberOf;
	}
	public By getFuelType() {
		return FuelType;
	}
	public By getPayload() {
		return Payload;
	}
	public By getTotalWeight() {
		return TotalWeight;
	}
	public By getListPrice() {
		return ListPrice;
	}
	public By getLicensePlate() {
		return LicensePlate;
	}
	public By getAnnualMileage() {
		return AnnualMileage;
	}
	public By getNext1() {
		return Next1;
	}
	public By getFirstName() {
		return FirstName;
	}
	public By getLastName() {
		return LastName;
	}
	public By getDateBirth() {
		return DateBirth;
	}
	public By getGender() {
		return Gender;
	}
	public By getStreetAddress() {
		return StreetAddress;
	}
	public By getCountry() {
		return Country;
	}
	public By getZipCode() {
		return ZipCode;
	}
	public By getCity() {
		return City;
	}
	public By getOccupation() {
		return Occupation;
	}
	public By getHobbies() {
		return Hobbies;
	}
	public By getNext2() {
		return Next2;
	}
	public By getStartDate() {
		return StartDate;
	}
	public By getInsuranceSum() {
		return InsuranceSum;
	}
	public By getMeritRating() {
		return MeritRating;
	}
	public By getDamageInsurance() {
		return DamageInsurance;
	}
	public By getOptionalProducts() {
		return OptionalProducts;
	}
	public By getCourtesyCar() {
		return CourtesyCar;
	}
	public By getNext3() {
		return Next3;
	}
	public By getSelectOption() {
		return SelectOption;
	}
	public By getNext4() {
		return Next4;
	}
	public By getEmail() {
		return Email;
	}
	public By getPhone() {
		return Phone;
	}
	public By getUsername() {
		return Username;
	}
	public By getPassword() {
		return Password;
	}
	public By getConfirmPassword() {
		return ConfirmPassword;
	}
	public By getComments() {
		return Comments;
	}
	public void setSend(By send) {
		Send = send;
	}
	public By getSend() {
		return Send;
	}
	public By getSucess() {
		return sucess;
	}
	 
	 
	
	 
}
