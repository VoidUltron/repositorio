Select * From Dourado;
-- Aqui é exibido o valor bruto das vendas realizadas.
SELECT (SUM(Dourado.Preço_A_V)) - (SUM(Dourado.Custo)) AS ValorBruto
FROM Dourado;

-- Aqui é mostrado a quantidade de vendas nos dias.
SELECT Data_Mov, COUNT(*) AS QuantidadeVendas, SUM(Preço_A_V) AS VolumeVendas
FROM Dourado
GROUP BY Data_Mov
ORDER BY QuantidadeVendas DESC;

-- Aqui mostra os produtos campeões de venda.
SELECT Descricoo_do_Produto, COUNT(*) AS CampeãoDeVendas
FROM Dourado
GROUP BY Descricoo_do_Produto
ORDER BY CampeãoDeVendas DESC
Limit 1;

-- Aqui mostra os produtos campeões de lucro bruto
SELECT (SUM(Dourado.Preço_A_V)) - (SUM(Dourado.Custo)) AS CampeaoLucroBruto , Descricoo_do_Produto 
FROM Dourado
GROUP BY Descricoo_do_Produto
ORDER BY CampeaoLucroBruto  DESC
LIMIT 1;

-- Aqui mostra os produtos vendidos nos dias 31/10/2023;
SELECT Descricoo_do_Produto, Data_Mov 
FROM Dourado
WHERE Data_Mov = 'FRU31/10/2023'
GROUP BY Descricoo_do_Produto
ORDER BY Descricoo_do_Produto DESC;

-- Aqui mostra o valor do estoque no dia 01/10/23
SELECT SUM(Custo * Estoque) as ValorInicial
FROM Dourado
WHERE Data_Mov = 'FRU01/10/2023';

-- Aqui mostra o valor do estoque no dia 31/10/23
SELECT SUM(Custo * Estoque) as ValorFinal
FROM Dourado
WHERE Data_Mov = 'FRU31/10/2023';








