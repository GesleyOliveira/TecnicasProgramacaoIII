package HorasTrabalhadas;

public class CalcularHorasTrabalhadas2 {
    double horaTotal = 0;
    double horaExtra = 0;
    double depoisDasDez = 0;
    double aux = 0;
    
    
    public double calcularHoras2(double horaInicio, double horaFim){
        horaTotal = horaFim - horaInicio;
        if(horaTotal > 6){
            horaTotal += 1.5;
        }
        
        return horaTotal;
    }
    
}
