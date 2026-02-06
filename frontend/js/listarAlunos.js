async function carregarTabela(){
    const resposta = await fetch(API_URL);
    const alunos = await resposta.json();
    const tabela = document.getElementById('corpoTabela');

    tabela.innerHTML ='';

    alunos.forEach(aluno => {
        const linha = `
        <tr>
             <td>${aluno.ra}</td>
             <td>${aluno.nomeAluno}</td>
             <td>${aluno.turma}</td>
             <td>
                 <button class="btn-del" onclick="deletarAluno(${aluno.idAluno})">Excluir</button>
                 <button class="btn-edit" onclick="preencherFormulario(${aluno.idAluno}, '${aluno.nomeAluno}', '${aluno.turma}', '${aluno.ra})'">Editar</button>
             </td>
        </tr>
        `;
        tabela.innerHTML += linha;
    });
}

carregarTabela();