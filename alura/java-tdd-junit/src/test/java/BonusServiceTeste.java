import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTeste {

    @Test
    void bonusZeradoSalarioAlto(){
        BonusService service = new BonusService();
//        BigDecimal bonus = service.calcularBonus(new Funcionario("Edward", LocalDate.now(), new BigDecimal("25000")));

//        assertEquals(new BigDecimal("0.00"), bonus);
//        try {
//            service.calcularBonus(new Funcionario("Edward", LocalDate.now(), new BigDecimal("25000")));
//            fail("Não retornou a exception");
//        } catch (Exception e){
//            assertEquals("Funcionário com salário muito alto, não pode recebe bonûs!", e.getMessage());
//        }
        assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Edward", LocalDate.now(), new BigDecimal("25000"))));
    }

    @Test
    void bonusDezPercentualSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Edward", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDezPercentualSalarioTeto(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Edward", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
