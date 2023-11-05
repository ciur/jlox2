enum TokenType {
    // Single-character tokens
    LEFT_PARENT, RIGHT_PARENT, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, PLUS, MINUS, SEMICOLON, SLASH, STAR,

    // One or two character tokens
    BANG, EQUAL, BANG_EQUAL, EQUA_EQUAL,
    GREATER, GREATER_EQUAL, LESS, LESS_EQUAL,

    // Literal
    IDENTIFIER, STRING, NUMBER,

    // keywords
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR, PRINT,
    RETURN, SUPER, THIS, TRUE, VAR, WHILE,

    EOF
}
