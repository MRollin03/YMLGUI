# YMLGUI

A simple GUI tool to edit and manage YAML files.
> [!note]
> UNDER DEVELOPMENT (WIP)

## 🚀 Features

* Helps avoid manual syntax errors when modifying YAML files.
* Ideal for configuration files, DevOps lists, or any structured data in YAML format.

## Ideal Future Features:
* GUI Support With edit Options
* Minecraft spigot config transfer support

## 🧠 Getting Started

### Prerequisites

* Java (or the runtime required by your GUI framework).
* The YAML file(s) you wish to open/edit.
* Basic familiarity with YAML structure.

### Installation


1. Clone the repository:

   ```bash
   git clone https://github.com/MRollin03/YMLGUI.git
   cd YMLGUI
   ```
2. Build the project (if there is a build system defined — e.g., Maven, Gradle, or an IDE):

   ```bash
   # Example with Gradle
   ./gradlew build
   ```
3. Run the application:

   ```bash
   java -jar build/libs/YMLGUI.jar
   ```

   Or launch from your IDE.

## 📑 Usage

1. Launch the GUI tool.
2. Use **File → Open** to select a `.yml` or `.yaml` file.
3. Browse the tree-view of the YAML structure.

## 📚 Project Structure

```
YMLGUI/
├─ .idea/                 # IDE metadata
├─ src/                   # Source code
├─ test/                  # Unit / integration tests
├─ .gitignore
└─ untitled.iml           # IDE module file
```

## ✅ Contributing

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature/MyFeature`).
3. Make your changes and commit (`git commit -m "Add my feature"`).
4. Push to your branch (`git push origin feature/MyFeature`).
5. Create a Pull Request describing your changes.
6. Please make sure your code is properly tested.

## 📄 License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
