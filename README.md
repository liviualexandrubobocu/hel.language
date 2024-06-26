# HEL (Hemingway's Language) Definition

## Introduction

The **hel** language is designed to facilitate communication between humans and AI agents, as well as between AI agents themselves.
It aims to provide a syntax and semantics that closely resemble natural English (Hemingway's Language), making it easy for humans to understand and for machines to process.
It aims to provide Turing completeness.
Hel is a versatile language with a variety of features, including basic commands, conditional commands, loops, error handling, interactive commands, complex tasks, context-aware commands, modular task definition and execution, CRUD commands, function definition and calls, and list and dictionary declarations.

## Features

1. **Basic Commands**: Allows executing a sequence of words as a command.
2. **Conditional Commands**: Allows executing a basic command based on a condition.
3. **Loop Commands**: Allows executing a basic command repeatedly or based on a condition.
4. **Error Handling**: Allows specifying actions to be taken if a command fails.
5. **Interactive Commands**: Allows creating a dialog between a user and an agent.
6. **Complex Tasks**: Allows defining and executing a sequence of subtasks.
7. **Context-Aware Commands**: Allows executing a command based on the current context.
8. **Modular Task Definition and Execution**: Allows defining and executing modular tasks.
9. **CRUD Commands**: Allows creating, reading, updating, and deleting entities.
10. **Function Definition and Calls**: Allows defining and calling functions.
11. **List and Dictionary Declarations**: Allows declaring and initializing lists and dictionaries.

## Grammar Overview

### Lexer Rules
- **Whitespace (`WS`)**: Skips spaces, tabs, and newlines.
- **Word (`WORD`)**: Matches sequences of alphabetic characters.
- **Number (`NUMBER`)**: Matches sequences of digits.
- **Time (`TIME`)**: Matches time in the format `HH:MM`.
- **String (`STRING`)**: Matches text enclosed in double quotes.

### Keywords
- **IF, EVERY, REMEMBER, USE, FAILS, NOTIFY, AT, FOR, TO, ME, MORNING, AM, PM, AND, OR, NOT, CREATE, READ, UPDATE, DELETE, WITH, HAVING, FUNCTION, LIST, DICT, LET, WHILE**

### Parser Rules
- **Program**: Consists of one or more statements.
- **Statement**: Can be a basic command, conditional command, loop command, remember command, error handling command, interactive command, complex task, context-aware command, modular task definition, modular task execution, CRUD command, function definition, list declaration, dictionary declaration, or variable assignment.

## Command Definitions and Examples

### Basic Commands
Represents a basic command consisting of one or more words followed by a period.
```hel
Turn on the lights.
```

### Conditional Commands
Represents a conditional command with an if condition and a basic command.
```hel
If it is raining, close the windows.
```

### Loop Commands
Represents a loop command that executes a basic command at a specified interval.
```hel
Every 5 minutes, check the weather.
```
Represents a loop command with a for loop structure.
```hel
For (let $i = 0; $i < 10; let $i = $i + 1) {
    Print $i.
}
```
Represents a loop command with a while loop structure.
```hel
While (there is work) {
    Process work.
}
```

### Error Handling Commands
Represents an error handling command with a basic command and optional custom error handling.
```hel
Send email fails, notify me.
```

### Interactive Commands
Represents an interactive command with a dialog between a user and an agent.
```hel
User: What is the weather today?
Agent: The weather today is sunny.
```

### Complex Tasks
Represents a complex task with a sequence of subtasks.
```hel
Prepare breakfast:
- Boil water.
- Brew coffee.
- Toast bread.
```

### Context-Aware Commands
Represents a context-aware command.
```hel
Check email.
```

### Modular Task Definition and Execution
Represents the definition of a modular task with a sequence of subtasks.
```hel
Define morning routine:
- Wake up.
- Brush teeth.
- Exercise.
```
Represents the execution of a modular task.
```hel
Execute morning routine.
```

### CRUD Commands
Represents CRUD commands to create, read, update, and delete entities.
```hel
Create user with name "John Doe".
Read user having name "John Doe".
Update user having name "John Doe" with email "john@example.com".
Delete user having name "John Doe".
```

### Function Definition and Calls
Represents the definition of a function with parameters and statements.
```hel
Function greet($name) {
    Print "Hello, " $name.
}
```
Represents a function call with arguments.
```hel
Greet("Alice").
```

### List and Dictionary Declarations
Represents the declaration and initialization of a list.
```hel
List $items = ["apple", "banana", "cherry"].
```
Represents the declaration and initialization of a dictionary.
```hel
Dict $person = {"name": "John", "age": 30}.
```

## Conclusion

The **hel** language is designed to be versatile and powerful, enabling efficient communication and task execution between humans and AI agents. By following the provided syntax and examples, users can create complex and context-aware commands, define and execute modular tasks, handle errors, and much more.

## HEL Grammar

The HEL language grammar defines the structure and rules for writing commands in the language. It consists of the following components:

- **Lexer Rules**: These rules define the basic tokens like whitespace (WS), words (WORD), numbers (NUMBER), time format (TIME), and string literals (STRING).
- **Keywords**: These are specific words used in HEL language for various commands.
- **Parser Rules**: These rules define the structure of commands in HEL language, including simple commands, conditional commands, loop commands, remember commands, error handling commands, interactive commands, dialogues, dialog steps, and conditions.

Refer to the HEL language grammar for a detailed understanding of the language's syntax.

## Conclusion

The HEL language is designed to bridge the gap between human language and AI systems, providing a natural and intuitive way to interact with agentic AI. By mimicking the structure and vocabulary of natural language, it makes interaction with AI more accessible and efficient for users.

## Documentation on how to run tests

In a CMD terminal, run the following command

```grun Hel program -tokens -gui <input_file>```

