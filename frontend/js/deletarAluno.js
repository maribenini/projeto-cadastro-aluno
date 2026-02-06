async function deletarAluno(id){
    if (confirm("Tem certeza que deseja excluir este aluno?")){
        await fetch(`${API_URL}/${id}`, {
            method: 'DELETE'
        });

        carregarTabela();
    }
}