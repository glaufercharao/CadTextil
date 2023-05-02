CREATE TABLE tb_estoque (
    id INT UNSIGNED auto_increment NOT NULL,
    produto varchar(100) NOT NULL,
    cor varchar(100) NOT NULL,
    tamanho varchar(100) NOT NULL,
    deposito varchar(100) NOT NULL,
    data_disponibilidade DATE NOT NULL,
    quantidade INT UNSIGNED NOT NULL,
    CONSTRAINT estoque_pk PRIMARY KEY (id),
    CONSTRAINT estoque_un UNIQUE KEY (produto,cor,tamanho,deposito,data_disponibilidade)
);

INSERT INTO tb_estoque (produto, cor, tamanho, deposito, data_disponibilidade, quantidade) VALUES ('10.01.0419','00','P','DEP1',TIMESTAMP WITH TIME ZONE'2023-01-13T03:00:00Z',15);
INSERT INTO tb_estoque (produto, cor, tamanho, deposito, data_disponibilidade, quantidade) VALUES ('11.01.0568','08','P','DEP1',TIMESTAMP WITH TIME ZONE'2023-01-13T03:00:00Z',2);
INSERT INTO tb_estoque (produto, cor, tamanho, deposito, data_disponibilidade, quantidade) VALUES ('11.01.0568','08','M','DEP1',TIMESTAMP WITH TIME ZONE'2023-01-13T03:00:00Z',4);
INSERT INTO tb_estoque (produto, cor, tamanho, deposito, data_disponibilidade, quantidade) VALUES ('11.01.0568','08','G','1',TIMESTAMP WITH TIME ZONE'2023-01-13T03:00:00Z',6);
INSERT INTO tb_estoque (produto, cor, tamanho, deposito, data_disponibilidade, quantidade) VALUES ('11.01.0568','08','P','DEP1',TIMESTAMP WITH TIME ZONE'2023-01-10T03:00:00Z',8);