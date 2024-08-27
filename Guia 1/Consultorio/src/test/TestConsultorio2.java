package test;
import modelo.Paciente;
import modelo.Medico;

public class TestConsultorio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente("José", "Pérez",1.80f,85);
		Paciente paciente2 = new Paciente("Jorge", "Fernández",1.60f,90);
		Paciente[] pacientes = {paciente1, paciente2};
		Medico medico = new Medico("Daniel", "López", "Medico", pacientes);
		System.out.println("Medico: " + medico.getNombre() + " " + medico.getApellido());
		System.out.println(paciente1.traerNombreCompleto() + ": IMC " + medico.calcularIMC(paciente1));
		System.out.println(paciente2.traerNombreCompleto() + ": IMC " + medico.calcularIMC(paciente2));
		System.out.println("\nCambiamos los pesos a 100 y 105 respectivamente\n");
		paciente1.setPeso(100);
		paciente2.setPeso(105);
		System.out.println("Medico: " + medico.getNombre() + " " + medico.getApellido());
		System.out.println(paciente1.traerNombreCompleto() + ": IMC " + medico.calcularIMC(paciente1));
		System.out.println(paciente2.traerNombreCompleto() + ": IMC " + medico.calcularIMC(paciente2));
		
		System.out.println("\nPromedio de peso de los pacientes: " + medico.traerPromedioPeso());

        Paciente mayorEstatura = medico.traerPacienteMayorEstatura();
        System.out.println("\nPaciente con mayor estatura: " + mayorEstatura.getNombre() + " " + mayorEstatura.getApellido());

        Paciente menorIMC = medico.traerMenorIMC();
        System.out.println("\nPaciente con menor IMC: " + menorIMC.getNombre() + " " + menorIMC.getApellido());
	}
}
