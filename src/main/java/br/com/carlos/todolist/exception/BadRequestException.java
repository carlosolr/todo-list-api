package br.com.carlos.todolist.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.carlos.todolist.exception.comum.TodoListException;


/**
 * Exceção interna para BadRequest=400 podendo indicar:
 * - parâmetro obrigatório não informado
 * - combinação de parâmetros incorreta
 * - etc
 *
 * @author carlos.oliveira
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends TodoListException {

    public BadRequestException(String mensagem) {
        super(mensagem);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.BAD_REQUEST;
    }
}
