const fs = require('fs');

function calcularFaturamento() {
    const data = JSON.parse(fs.readFileSync('faturamento.json', 'utf8'));

    let menorFaturamento = Infinity;
    let maiorFaturamento = -Infinity;
    let somaFaturamento = 0;
    let diasComFaturamento = 0;

    data.forEach(dia => {
        if (dia.faturamento > 0) {
            if (dia.faturamento < menorFaturamento) {
                menorFaturamento = dia.faturamento;
            }
            if (dia.faturamento > maiorFaturamento) {
                maiorFaturamento = dia.faturamento;
            }
            somaFaturamento += dia.faturamento;
            diasComFaturamento++;
        }
    });

    const mediaFaturamento = somaFaturamento / diasComFaturamento;

    const diasAcimaMedia = data.filter(dia => dia.faturamento > mediaFaturamento).length;

    console.log('Menor faturamento:', menorFaturamento);
    console.log('Maior faturamento:', maiorFaturamento);
    console.log('Dias com faturamento acima da média:', diasAcimaMedia);
}

calcularFaturamento();
