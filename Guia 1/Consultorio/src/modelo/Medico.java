package modelo;

public class Medico {
	// atributos
    private String nombre;
    private String apellido;
    private String especialidad;
    private Paciente[] pacientesFrecuentes;

    // Constructor
    public Medico(String nombre, String apellido, String especialidad, Paciente[] pacientesFrecuentes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.pacientesFrecuentes = pacientesFrecuentes;
    }
    
    // metodos getter y setter
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Paciente[] getPacientesFrecuentes() {
		return pacientesFrecuentes;
	}

	public void setPacientesFrecuentes(Paciente[] pacientesFrecuentes) {
		this.pacientesFrecuentes = pacientesFrecuentes;
	}

    public float calcularIMC(Paciente paciente) {
        return paciente.getPeso() / (paciente.getEstatura() * paciente.getEstatura());
    }

    public double traerPromedioPeso() {
        double suma = 0;
        for (Paciente paciente : pacientesFrecuentes) {
            suma += paciente.getPeso();
        }
        return suma / pacientesFrecuentes.length;
    }

    public Paciente traerPacienteMayorEstatura() {
        Paciente mayorEstatura = pacientesFrecuentes[0];
        for (Paciente paciente : pacientesFrecuentes) {
            if (paciente.getEstatura() > mayorEstatura.getEstatura()) {
                mayorEstatura = paciente;
            }
        }
        return mayorEstatura;
    }

    public Paciente traerMenorIMC() {
        Paciente menorIMC = pacientesFrecuentes[0];
        float menorIMCValor = calcularIMC(menorIMC);

        for (Paciente paciente : pacientesFrecuentes) {
            float imcActual = calcularIMC(paciente);
            if (imcActual < menorIMCValor) {
                menorIMC = paciente;
                menorIMCValor = imcActual;
            }
        }
        return menorIMC;
    }
}
