import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.Desempenho;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {
    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar(){
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Edward", LocalDate.now(), new BigDecimal("1000"));
    }

    @AfterEach
    public void finalizar(){
        System.out.println("Fim");
    }

    @BeforeAll
    public static void antesTodos(){
        System.out.println("Antes de todos");
    }

    @AfterAll
    public static void depoisTodos(){
        System.out.println("Depois de todos");
    }

    @Test
    public void reajusteTresPercentualDesejavel(){
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteQuinzePercentualBom(){
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteVintePercentualExcelente(){
        service.concederReajuste(funcionario, Desempenho.EXCELENTE);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
