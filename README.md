# hel.language

## Introduction

The hel.language is a programming language designed for agentic AI systems. It aims to provide a syntax and semantics that closely resemble natural English, making it easy for humans to understand and for machines to process. This documentation provides an overview of the language's key features, syntax, and usage examples.

## Key Features

- **Simple and Intuitive Syntax**: The language uses plain English phrases, making it easy for users to write commands.
- **Context Awareness**: hel.language supports context to understand references and follow-up commands, enabling more natural and interactive conversations with the AI agent.
- **Modularity and Extensibility**: Users can define and reuse tasks, promoting code reusability and maintainability.
- **Error Handling**: The language provides clear ways to specify and handle potential errors or exceptions, ensuring robustness in command execution.
- **Interactivity**: hel.language supports dialogues, allowing the agent to ask clarifying questions and engage in interactive conversations with the user.

## Syntax and Usage

### Basic Commands

To issue a basic command, simply use plain English phrases. For example:

```
Fetch the latest news headlines.
```

This command instructs the agent to perform a single action.

### Conditional Statements

hel.language supports conditional statements using the "If" structure. For example:

```
If it is raining, remind me to take an umbrella.
```

This command sets up a condition and specifies the action to be taken based on that condition.

### Loops and Repetition

To create commands that repeat at specific intervals, hel.language provides the "Every" structure. For example:

```
Every morning at 7 AM, give me a summary of today's weather and my calendar events.
```

This example demonstrates how to set up a recurring task using natural language.

### Variables and References

hel.language allows users to store preferences and refer to them later. For example:

```
Remember that my favorite color is blue. Use this color for the background of my reports.
```

This command demonstrates storing a preference and using it in subsequent commands.

### Error Handling

To handle potential errors or exceptions, hel.language provides the "If fails, notify" structure. For example:

```
Send an email to John. If it fails, notify me immediately.
```

This command includes an action and specifies how to handle failure.

### Interactive Dialogue

hel.language supports interactive dialogues, enabling the agent to ask clarifying questions to complete a task. For example:

```
User: Book a table at an Italian restaurant for tonight.
Agent: What time would you like the reservation?
User: 7 PM.
Agent: How many people will be attending?
User: Four.
```

This interaction showcases the agent's ability to engage in a conversation and gather necessary information.

### Complex Task with Subtasks

hel.language allows users to break down complex tasks into manageable subtasks. For example:

```
Plan my trip to New York.
- Book a flight for next Friday.
- Reserve a hotel room near Central Park.
- Schedule meetings with clients on Monday and Tuesday.
```

The agent can execute each subtask sequentially, simplifying the management of complex tasks.

### Using Context

hel.language leverages context to understand the user's intent based on previous conversations. For example:

```
User: What's the weather like?
Agent: It's sunny and 75 degrees.
User: Great, then schedule a picnic for tomorrow afternoon.
```

The agent uses the context of the previous conversation to understand the new command.

### Modular and Reusable Tasks

hel.language promotes code reusability by allowing users to define and reuse tasks. For example:

```
Define my morning routine.
- At 6:30 AM, wake me up with my favorite song.
- At 6:35 AM, give me a summary of today's news.
- At 6:45 AM, remind me to exercise.

Execute my morning routine.
```

Users can define routines and execute them whenever needed, enhancing productivity.

## HEL Grammar

The hel.language grammar defines the structure and rules for writing commands in the language. It consists of the following components:

- **Lexer Rules**: These rules define the basic tokens like whitespace (WS), words (WORD), numbers (NUMBER), time format (TIME), and string literals (STRING).
- **Keywords**: These are specific words used in hel.language for various commands.
- **Parser Rules**: These rules define the structure of commands in hel.language, including simple commands, conditional commands, loop commands, remember commands, error handling commands, interactive commands, dialogues, dialog steps, and conditions.

Refer to the hel.language grammar for a detailed understanding of the language's syntax.

## Conclusion

The hel.language is designed to bridge the gap between human language and AI systems, providing a natural and intuitive way to interact with agentic AI. By mimicking the structure and vocabulary of natural language, it makes interaction with AI more accessible and efficient for users.

