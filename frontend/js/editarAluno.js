function preencherFormulario(id, nome, turma, ra){

    document.getElementById('alunoId').value = id;
    document.getElementById('nome').value = nome;
    document.getElementById('turma').value = turma;
    document.getElementById('ra').value = ra;
}

async function atualizarAluno(id, aluno){
    await fetch(`${API_URL}/${id}`, {
        method: 'PUT',
        headers: {'Contend-Type': 'application/json'},
        body: JSON.stringify(aluno)
    });

    document.getElementById('alunoId').value = '';
    document.getElementById('alunoForm').requestFullscreen();

    carregarTabela();
}