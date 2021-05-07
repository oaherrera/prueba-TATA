package com.tata.qa.prueba.pages;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {
	
	 public static final Target PRODUCTO_CATEGORIA_SPEAKERS = Target.the("Producto Categoria Speakers")
	            .locatedBy("//div[@id='speakersImg']");
	 public static final Target PRODUCTO_SELECCIONADO = Target.the("Producto Seleccionado")
	            .locatedBy("//img[@class='imgProduct']/following::p//a[contains(text(),'Bose Soundlink Bluetooth Speaker III')]");
	 public static final Target AGREGAR_AL_CARRITO = Target.the("Agregar al Carrito")
	            .locatedBy("//button[@name='save_to_cart']");
	 public static final Target BOTON_CHECKOUT = Target.the("Boton Checkout")
	            .locatedBy("//button[@id='checkOutPopUp']");
	 public static final Target BOTON_NEXT = Target.the("Boton Next")
	            .locatedBy("//button[@id='next_btn']");
	 public static final Target TIPO_PAGO = Target.the("Tipo de Pago")
	            .locatedBy("//input[@name='safepay']");
	 public static final Target SAFEPAY_USERNAME = Target.the("Safe Pay Username")
	            .locatedBy("//input[@name='safepay_username']");
	 public static final Target SAFEPAY_PASSWORD = Target.the("Safe Pay Username")
	            .locatedBy("//input[@name='safepay_password']");
	 public static final Target BUTTON_PAY_NOW = Target.the("Button Pay Now")
	            .locatedBy("//button[@id='pay_now_btn_SAFEPAY']");
	 public static final Target MENSAJE_ORDEN_EXITOSA = Target.the("Mensaje Orden exitosa")
	            .locatedBy("//span[contains(text(),'Thank you for buying with Advantage')]");
	 
	 

}
