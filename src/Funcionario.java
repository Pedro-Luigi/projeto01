import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Classes.HoraContrato;
import Classes.departamento;
import Classes.trabalhador;
import Enum.NivelTrabalhador;

public class Funcionario {
	public static void main(String[] args) throws ParseException {
		
	/*
		Enter department's name: Design
Enter worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00
How many contracts to this worker? 3
Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2018
Value per hour: 50.00
Duration (hours): 20
Enter contract #2 data:
Date (DD/MM/YYYY): 13/06/2018
Value per hour: 30.00
Duration (hours): 18
Enter contract #3 data:
Date (DD/MM/YYYY): 25/08/2018
Value per hour: 80.00
Duration (hours): 10
Enter month and year to calculate income (MM/YYYY): 08/2018
Name: Alex
Department: Design
Income for 08/2018: 3000.00
		*/
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		//Nome do departamento
		System.out.println("Entre com o nome do departamento: ");
		String departamento = ler.next();
		// Dados do trabalhador
		System.out.println("Entre com os dados do trabalhador:");
		System.out.print("Nome:");
		String nome = ler.next();
		System.out.print("Cargo:");
		String cargo = ler.next();
		System.out.println("Salário base:");
		double salario=ler.nextDouble();
		//Instanciando a classe trabalhador 
		trabalhador dadosFuncionario = new trabalhador(nome, NivelTrabalhador.valueOf(cargo), salario, new departamento(departamento));
		
		//Verificando quantos contratos serão adicionados.
		System.out.println("How many contracts to this worker?");
		int cont=ler.nextInt();
		
		for (int i=1; i<=cont; i++) {
			System.out.println("Enter contract #" +i+ " data:");
			System.out.println("Date (DD/MM/YYYY):");
			Date infData= data.parse(ler.next());
			System.out.println("Value per hour:");
			double valorPorHora= ler.nextDouble();
			System.out.println("Duration (hours):");
			int hora=ler.nextInt();
			HoraContrato contrato= new HoraContrato(infData,valorPorHora,hora);
		}
		
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY):");
		String calculo= ler.next();
		int month=Integer.parseInt(calculo.substring(0, 2));
		int year=Integer.parseInt(calculo.substring(3));
		
		System.out.println("Name:"+ dadosFuncionario.getNome());
		System.out.println("Departmento:"+ dadosFuncionario.getDepartamento().getNome());
		System.out.println("Renda do mês "+ calculo + ": R$" + String.format("%.2f", dadosFuncionario.renda(year, month)));
		
		ler.close();
	}

}
