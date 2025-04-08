public record SMS(int mensagem) implements MensagemMarketing{

    @Override
	public String getMensagemMarketing(){
		
		return "Mensagem recebida via SMS: " + mensagem;
	}


}
