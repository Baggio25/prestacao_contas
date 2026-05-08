CREATE TABLE usuarios (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(150) UNIQUE,
    senha VARCHAR(255),
    perfil VARCHAR(20),
    ativo BOOLEAN,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);

CREATE TABLE pessoas (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(150),
    cpf_cnpj VARCHAR(20),
    whatsapp VARCHAR(20),
    celular VARCHAR(20),
    telefone VARCHAR(20),
    email VARCHAR(150),
    ativo BOOLEAN,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);

CREATE TABLE categorias (
    id BIGSERIAL PRIMARY KEY,
    descricao VARCHAR(100),
    tipo VARCHAR(20),
    ativo BOOLEAN,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);

CREATE TABLE bancos (
    id BIGSERIAL PRIMARY KEY,
    descricao VARCHAR(100),
    numero VARCHAR(10),
    ativo BOOLEAN
);

CREATE TABLE contas (
    id BIGSERIAL PRIMARY KEY,
    descricao VARCHAR(100),
    tipo VARCHAR(20),
    banco_id BIGINT,
    agencia VARCHAR(20),
    numero_conta VARCHAR(20),
    saldo_inicial NUMERIC(15,2),
    saldo_atual NUMERIC(15,2),
    ativo BOOLEAN,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    FOREIGN KEY (banco_id) REFERENCES bancos(id)
);

CREATE TABLE lancamentos (
    id BIGSERIAL PRIMARY KEY,
    tipo VARCHAR(20),
    pessoa_id BIGINT,
    conta_id BIGINT,
    categoria_id BIGINT,
    valor NUMERIC(15,2),
    data_inclusao TIMESTAMP,
    data_vcto DATE,
    data_baixa DATE,
    status VARCHAR(20),
    forma_pagamento VARCHAR(20),
    anexo TEXT,
    observacao TEXT,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    FOREIGN KEY (pessoa_id) REFERENCES pessoas(id),
    FOREIGN KEY (conta_id) REFERENCES contas(id),
    FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);