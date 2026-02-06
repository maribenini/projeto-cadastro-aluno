document.getElementById('alunoForm').addEventListener('submit', async (event) => {
    event.preventDefault();

    const id = document.getElementById('alunoId').value;
    const aluno = {
        nomeAluno: document.getElementById('nome').value,
        turma: document.getElementById('turma').value,
        ra: document.getElementById('ra').value,
    };

    if(id){
        atualizarAluno(id, aluno);
    } else {
        await fetch(API_URL, {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(aluno)
        });

        document.getElementById('alunoForm').reset();
        carregarTabela();
    }
});