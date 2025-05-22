@Service
public class PoupancaService {

    private final RestTemplate restTemplate;

    public PoupancaService() {
        this.restTemplate = new RestTemplate();
    }

    public List<ModelPoupanca> getAllPoupancas() {
        String url = "http://localhost:3000/poupancas";
        ResponseEntity<ModelPoupanca[]> response =
                restTemplate.getForEntity(url, ModelPoupanca[].class);
        ModelPoupanca[] poupancas = response.getBody();
        return Arrays.asList(poupancas);
    }
}
