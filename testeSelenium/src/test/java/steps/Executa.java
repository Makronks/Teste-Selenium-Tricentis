package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

 
public class Executa {
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	@Given("dado que esteja no {string}")
	public void dado_que_esteja_no(String site) {
	    metodos.abrirNavegador(site);
	    
	}

	@Given("cadastro formulario vehicle")
	public void cadastro_formulario_vehicle() {
	    metodos.combo(elementos.getMake());
	    metodos.combo(elementos.getModel());
	    metodos.escrever(elementos.getCylinder(),"1000");
	    metodos.escrever(elementos.getEngine(), "2000");
	    metodos.escrever(elementos.getDate(), "10/10/2020");
	    metodos.combo(elementos.getNumber());
	    metodos.clicar(elementos.getRight());
	    metodos.combo(elementos.getNumberOf());
	    metodos.combo(elementos.getFuelType());
	    metodos.escrever(elementos.getPayload(), "1000");
	    metodos.escrever(elementos.getTotalWeight(), "10000");
	    metodos.escrever(elementos.getListPrice(), "100000");
	    metodos.escrever(elementos.getAnnualMileage(), "10000");	   
	    metodos.clicar(elementos.getNext1());
	    
	}

	@When("realizo o cadastro insuant")
	public void realizo_o_cadastro_insuant() {
		metodos.escrever(elementos.getFirstName(), "Jonny");
		metodos.escrever(elementos.getLastName(), "Bygood");
		metodos.escrever(elementos.getDateBirth(), "01/01/2000");
		metodos.combo(elementos.getCountry());
		metodos.escrever(elementos.getZipCode(), "02127000");
		metodos.combo(elementos.getOccupation());
		metodos.clicar(elementos.getHobbies());
		metodos.clicar(elementos.getNext2());
		
	}

	@When("realizo cadastro product")
	public void realizo_cadastro_product() {
	   metodos.escrever(elementos.getStartDate(), "01/12/2023");
	   metodos.combo(elementos.getInsuranceSum());
	   metodos.combo(elementos.getMeritRating());
	   metodos.combo(elementos.getDamageInsurance());
	   metodos.clicar(elementos.getOptionalProducts());
	   metodos.combo(elementos.getCourtesyCar());
	   metodos.clicar(elementos.getNext3());
	}

	@When("cadastro select price option")
	public void cadastro_select_price_option() {
	   metodos.clicar(elementos.getSelectOption());
	   metodos.clicar(elementos.getNext4());
	}

	@Then("envio o formulario send")
	public void envio_o_formulario_send() {
	    metodos.escrever(elementos.getEmail(),"enricoviniciusmonteiro_@zyb.com.br");
	    metodos.escrever(elementos.getPhone(), "995328512");
	    metodos.escrever(elementos.getUsername(), "Ibirapitanga");
	    metodos.escrever(elementos.getPassword(), "a99532A");
	    metodos.escrever(elementos.getConfirmPassword(), "a99532A");
	    metodos.clicar(elementos.getSend());
	}

	@Then("valido texto")
	public void valido_texto() {
		metodos.screnShot("ScreShot");
		metodos.fecharNavegador();
	   
	}

}
